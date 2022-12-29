# springproject
Spring boot project with CRUD operations for order service , with Mysql and JPA Hibernate

**How you can run**

You can clone this repository on your local machine and open it in your favorite IDE, 

to test the API you can use application like POSTMAN, 

to run the application you can maven command **mvn spring-boot:run** or can simply click on run application
icon on your IDE.

And thereafter you can test the API's via  POSTMAN using JSON.

**Here are the API endpoints in the application and the sample results**

1) Create New Orders ("/order/create")

JSON payload
```
{
    "items" :[
			{
				"itemName" :"HeadPhones",
				"itemUnitPrice" : 1500,
				"itemQuantity" : 1
			},
			{
				"itemName" :"Shirts",
				"itemUnitPrice" : 2000,
				"itemQuantity" : 2
			}
		]
}
```
2) Get Order by Id ("order/{orderId}")
```
{
    "orderId": 1,
    "orderDate": "2022-12-29",
    "orderStatus": "New",
    "items": [
        {
            "itemId": 1,
            "itemName": "Sneaker",
            "itemUnitPrice": 1000,
            "itemQuantity": 2
        },
        {
            "itemId": 2,
            "itemName": "Books",
            "itemUnitPrice": 200,
            "itemQuantity": 3
        }
    ]
}
```
2) Get all Orders ("/order")
```
[
    {
        "orderId": 1,
        "orderDate": "2022-12-29",
        "orderStatus": "New",
        "items": [
            {
                "itemId": 1,
                "itemName": "Sneaker",
                "itemUnitPrice": 1000,
                "itemQuantity": 2
            },
            {
                "itemId": 2,
                "itemName": "Books",
                "itemUnitPrice": 200,
                "itemQuantity": 3
            }
        ]
    },
    {
        "orderId": 2,
        "orderDate": "2022-12-29",
        "orderStatus": "New",
        "items": [
            {
                "itemId": 3,
                "itemName": "HeadPhones",
                "itemUnitPrice": 1500,
                "itemQuantity": 1
            },
            {
                "itemId": 4,
                "itemName": "Shirts",
                "itemUnitPrice": 2000,
                "itemQuantity": 2
            }
        ]
    }
]
```
