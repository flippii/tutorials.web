public interface TodoRepository extends JpaRepository<Todo, Long> {

	@Query("Select t from Todo t where t.dueDate BETWEEN '2016-01-01' AND '2016-12-31'")
	List<Todo> getTodosOf2016();
}
