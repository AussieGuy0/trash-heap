# Temp Todo

## Overview
Allow users to create temporary TODO lists sharable via unique url.

## Api Endpoints
### POST /api/v1/todos
Create a new list of todo items

Expected request:
```json
{
  "id": "BlaBlaBla"
}

```

### GET /api/v1/todos/{id}
Returns a list of todo items under list with specified id.

### POST /api/v1/todos/{id}
Adds a new todo item in list with specified id.

Expected request:
```json
{
    "text": "The dishes"
}
```
### DELETE /api/v1/todos/{id}
Deletes the todo list with specified id.

### PUT /api/v1/todos/{listId}/{itemId}
Updates an existing todo item in list with specified id.

### DELETE /api/v1/todos/{listId}/{itemId}
Deletes a specified todoitem in list 
