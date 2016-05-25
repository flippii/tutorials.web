public interface TodoRepository extends JpaRepository<Todo, Long> {

	Optional<Todo> findBySummaryAndDueDate(String summary, Date date);
}
