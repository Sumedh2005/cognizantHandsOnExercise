
DECLARE
    v_age NUMBER;
BEGIN
    FOR rec IN (SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
                FROM Customers c
                JOIN Loans l ON c.CustomerID = l.CustomerID)
    LOOP
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('Discount applied for CustomerID: ' || rec.CustomerID
                || ' | New Interest Rate: ' || (rec.InterestRate - 1));
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Scenario 1 Done.');
END;
/


-- SCENARIO 2: Set IsVIP = TRUE for customers with balance over $10,000

DECLARE
BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers)
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('CustomerID ' || rec.CustomerID || ' is now VIP.');
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Scenario 2 Done.');
END;
/


-- SCENARIO 3: Print reminders for loans due within next 30 days

DECLARE
BEGIN
    FOR rec IN (SELECT l.LoanID, c.Name, l.EndDate
                FROM Loans l
                JOIN Customers c ON l.CustomerID = c.CustomerID
                WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30)
    LOOP
        DBMS_OUTPUT.PUT_LINE('REMINDER: Dear ' || rec.Name
            || ', your loan (ID: ' || rec.LoanID
            || ') is due on ' || TO_CHAR(rec.EndDate, 'YYYY-MM-DD'));
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Scenario 3 Done.');
END;
/