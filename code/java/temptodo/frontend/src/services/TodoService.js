
const baseUrl = '/api/v1';

function postJson(url, data) {
  const headers = new Headers({'Content-Type': 'application/json'});
  return fetch(url, {
    method: 'POST',
    body: JSON.stringify(data),
    headers: headers
  }).then((r) => {
    return r.json();
  })
}

function putJson(url, data) {
  const headers = new Headers({'Content-Type': 'application/json'});
  return fetch(url, {
    method: 'PUT',
    body: JSON.stringify(data),
    headers: headers
  }).then((r) => {
    return r.json();
  })

}

export default class TodoService {
  getTodos(id) {
    return fetch(`${baseUrl}/todos/${id}`, {
      method: 'GET',
    }).then((res) => {
      return res.json();
    })
  }

  addTodo(id, text) {
    return postJson(`${baseUrl}/todos/${id}`, {text: text, completed: false});
  }

  updateTodo(listId, todo) {
    return putJson(`${baseUrl}/todos/${listId}/${todo.id}`, todo);
  }

}
