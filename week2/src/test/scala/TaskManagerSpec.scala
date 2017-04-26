import org.scalatest._
import java.time.LocalDate

class TaskManagerSpec extends FlatSpec with Matchers {

  "An empty tasks list" should "have 0 tasks due today" in {
      val tasksDueToday = TaskManager.allTasksDueToday(List())
      tasksDueToday should have length 0
  }

  "A task list with one task due today" should "have 1 task due today" in {
    val t1 = Task("Write blog", LocalDate.now().plusDays(1), Seq("blog"))
    val t2 = Task("Shopping", LocalDate.now(), Seq("live"))

    val tasksDueToday = TaskManager.allTasksDueToday(List(t1, t2))

    tasksDueToday should have length 1
  }

}
