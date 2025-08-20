package com.app.financeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceManagementApplication.class, args);
	}

}


//NO CREAR POR EL MOMENTO LOS REPOSITORIOS PORQUE NO NECESITAMOS CONSULTAS ESPECIFICAS


/*
{
  "userId": 0,
  "category": { "id": 1 },
  "type": "INCOME",
  "amount": 100.0,
  "description": "Test transaction",
  "transactionDate": "2025-08-20T13:02:25"
}

{
  "name": "Salario"
}

{

    "name": "Anyelina A",
    "email": "Juan@gmail.com",
    "password": "1234214",
    "role": "USER"

}

 */