public class OldStudentLessonBuilder extends LessonBuilder {

    @Override
    public void GetLesson() {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        lesson.price = 49.99;
    }

    @Override
    public void ApplyDiscount() {
        lesson.discountedPrice = lesson.price;
        lesson.discountApplied = false;
    }

    @Override
    public void AddLessonNote() {
        lesson.lessonNote = "";
    }

    @Override
    public Lesson GetResult() {
        return lesson;
    }
}
