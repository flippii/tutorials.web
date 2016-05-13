@Component
public class Todo implements ITodo {

	public final long id;
	private String summary;
	private Boolean done;
	private Date dueDate;
	
	public Todo() {
		this(-1);
	}

	public Todo(long i) {
		this(i, "", false, null);
	}

	@Autowired
	public Todo(long i, String summary, boolean b, Date date) {
		this.id = i;
		this.summary = summary;
		this.done = b;
		this.dueDate = date;
	}
}
