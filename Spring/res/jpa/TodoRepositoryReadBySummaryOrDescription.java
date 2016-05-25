public interface TodoRepository extends JpaRepository<Todo, Long> {

	Stream<Todo> readBySummaryOrDescription(String summary, String description);
}
