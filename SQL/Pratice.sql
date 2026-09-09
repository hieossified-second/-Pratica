CREATE Procedure dadosCliente(id INT)
BEGIN
DECLARE comissao = 
SELECT customer as 'Cliente',
       payment as 'Pagamentos';



END

SELECT  payment_id,
        customer_id,
        staff_id,
        amount
FROM payment
where customer_id = 1;

DROP Procedure `comissaoStaff`;

DELIMITER //
CREATE Procedure comissaoStaff(id INT(1))
BEGIN
    SELECT 
            payment_id as 'Id pagamento',
            customer_id as 'Id cliente',
            staff_id as 'Id staff',
            amount as 'Valor Pago',
            CASE 
            WHEN staff_id = 1 THEN amount * 0.10 
            WHEN staff_id = 2 THEN amount * 0.05
            ELSE 0
            END AS comissao
        FROM payment
        WHERE customer_id = id;
END //

DELIMITER ;

CALL `comissaoStaff` (1);

SELECT * FROM payment
WHERE customer_id = 1;


-------------------------------------------------------------------

DELIMITER //

CREATE Procedure inserirCustomer(
    IN p_store_id INT,
    IN p_first_name VARCHAR(45),
    In p_last_name VARCHAR(45),
    IN p_email VARCHAR(150),
    IN p_address_id INT,
    In p_active boolean
)
BEGIN  
INSERT INTO customer(
    store_id,
    first_name,
    last_name,
    email,
    address_id,
    active
)
VALUES (
    p_store_id,
    p_first_name,
    p_last_name,
    p_email,
    p_address_id,
    p_active
);
END //

DELIMITER ;

SELECT * FROM customer;

CALL `inserirCustomer`(1,'Kevin', 'Solo', 'asdsjadksjadjsakdfdafojdof@gmail.com', 123, 1)

CREATE Procedure categoriasAssistido()
