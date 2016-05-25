public interface TodoRepository extends JpaRepository<Todo, Long> {

	List<Todo> getBySummary(String summary);
}
