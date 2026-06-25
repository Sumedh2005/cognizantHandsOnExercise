-- =============================================
-- EXERCISE 3: STORED PROCEDURES
-- =============================================

-- SCENARIO 1: Process monthly interest (1%) for all savings accounts

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountType = 'Savings';

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all Savings accounts.');
    COMMIT;
END;
/

-- Run it:
BEGIN
    ProcessMonthlyInterest;
END;
/


-- SCENARIO 2: Update employee bonus by department

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department   IN VARCHAR2,
    p_bonusPercent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonusPercent / 100)
    WHERE Department = p_department;

    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found in department: ' || p_department);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Bonus applied to ' || SQL%ROWCOUNT
            || ' employee(s) in ' || p_department);
    END IF;
    COMMIT;
END;
/

-- Run it:
BEGIN
    UpdateEmployeeBonus('IT', 10);  -- 10% bonus for IT department
END;
/


-- SCENARIO 3: Transfer funds between accounts

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_fromAccount IN NUMBER,
    p_toAccount   IN NUMBER,
    p_amount      IN NUMBER
) AS
    v_balance NUMBER;
BEGIN
    -- Check source account balance
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_fromAccount;

    IF v_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: Insufficient balance. Transfer cancelled.');
        RETURN;
    END IF;

    -- Deduct from source
    UPDATE Accounts
    SET Balance = Balance - p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_fromAccount;

    -- Add to destination
    UPDATE Accounts
    SET Balance = Balance + p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_toAccount;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer of ' || p_amount
        || ' from Account ' || p_fromAccount
        || ' to Account ' || p_toAccount || ' successful.');
END;
/

-- Run it:
BEGIN
    TransferFunds(1, 2, 500);  -- Transfer 500 from account 1 to account 2
END;
