public class LessonDirector {

    private LessonBuilder lessonBuilder;

    public LessonDirector(LessonBuilder lessonBuilder) {
        this.lessonBuilder = lessonBuilder;
    }

    public void make() {
        lessonBuilder.GetLesson();
        lessonBuilder.ApplyDiscount();
        lessonBuilder.AddLessonNote();
    }

}

