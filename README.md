```bash

$ curl localhost:8080/parents

{
    "content": [
        {
            "id": 2,
            "uuid": "2ff019fc-a542-4231-980c-e07bb052fafc",
            "column2": null,
            "children": [
                {
                    "id": 1,
                    "uuid": "84766b92-0e54-4297-91c6-21817e2ad263",
                    "column1": "child1",
                    "parents": []
                }
            ]
        }
    ],
    "pageable": {
        "sort": {
            "sorted": false,
            "unsorted": true,
            "empty": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "totalPages": 1,
    "last": true,
    "totalElements": 1,
    "size": 20,
    "number": 0,
    "sort": {
        "sorted": false,
        "unsorted": true,
        "empty": true
    },
    "numberOfElements": 1,
    "first": true,
    "empty": false
}

```
