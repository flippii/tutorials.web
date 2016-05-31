// Create a new Todo, which should be added
Todo newTodo = new Todo("New Todo");
newTodo.setDescription("Todo added by rest API");
newTodo.setDone(true);

ResponseEntity<Todo> postForEntity = restTemplate.postForEntity("http://localhost:8080/tasks/", newTodo, Todo.class);
System.out.println(postForEntity);
