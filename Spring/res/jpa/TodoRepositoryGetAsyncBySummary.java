public interface TodoRepository extends JpaRepository<Todo, Long> {

	@Async
	CompletableFuture<List<Todo>> findAsyncJava8BySummary(String summary);

	@Async
	Future<List<Todo>> findAsyncBeforeJava8BySummary(String summary);
}
