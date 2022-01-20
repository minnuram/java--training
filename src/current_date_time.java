import java.time.LocalDateTime;    

public class current_date_time {

	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
	}

}
