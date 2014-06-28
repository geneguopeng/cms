package cme
import cme.entity.batch.Batch
import cme.entity.project.Project
import cme.entity.questionpool.QuestionPool
import cme.entity.user.User
import grails.test.mixin.Mock
import org.junit.After
import org.junit.Before
import org.junit.Test
//@TestFor(UserService)
//@TestFor(ProjectService)
@Mock([User, Project, QuestionPool])
class MainProgromTests {

    UserService userService
    ProjectService projectService
    BatchService batchService
    PaperService paperService
    QuestionService questionService
    ResourceService resourceService

    @Before
    void setUp() {
        userService = new UserService()
        projectService = new ProjectService()
        batchService = new BatchService()
        paperService = new PaperService()
        questionService = new QuestionService()
        resourceService = new ResourceService()
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void standard() {
        User user = userService.createUser(name: "Admin", sn: "001")
        Project project = projectService.createProject(name: "Project1")
        println project.dump()
        QuestionPool questionPool = questionService.createQuestionPool(project, "QPools")
        questionService.importQuestions(questionPool, "question.xls")
        projectService.addQuestionsPool(questionPool)

        Batch batch = batchService.createBatch(project)
        batchService.addQuestionPool(questionPool)

        paperService.createGrade(batch)
        paperService.createPapers(batch, 3)

        userService.addUser(batch, user)
        userService.practiceQuestion(batch, user)
        userService.answerPaper(batch, user)

        fail "Implement me"
    }
}
