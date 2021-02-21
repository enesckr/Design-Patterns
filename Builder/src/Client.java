public class Client {
    public static void main(String[] args) {

        LessonBuilder lessonBuilder = new NewStudentLessonBuilder();

        LessonDirector lessonDirector = new LessonDirector(lessonBuilder);
        lessonDirector.make();

        Lesson lesson = lessonBuilder.GetResult();

        System.out.println(lesson.name + " - " + lesson.price + " - " + lesson.discountedPrice);

        // output: Artificial Intelligence -  Beginner to Advanced in 10 Minute. - 49,99 - 24,995

    }
}
