public interface TodoRepository extends JpaRepository<Todo, Long> {

	long countBySummary(String summary);
}
