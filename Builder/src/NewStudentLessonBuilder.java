public class NewStudentLessonBuilder extends LessonBuilder {

    @Override
    public void GetLesson() {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        lesson.price = 49.99;
    }

    @Override
    public void ApplyDiscount() {
        lesson.discountedPrice = lesson.price * 0.5;
        lesson.discountApplied = true;
    }

    @Override
    public void AddLessonNote() {
        lesson.lessonNote = "Hey, welcome. Your discount code has been applied!";
    }

    @Override
    public Lesson GetResult() {
        return lesson;
    }
}
