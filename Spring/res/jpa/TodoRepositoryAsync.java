public interface TodoRepository extends JpaRepository<Todo, Long> {

	@Async
	CompletableFuture<List<Todo>> findAsyncJava8();

	@Async
	Future<List<Todo>> findAsyncBeforeJava8();
}
