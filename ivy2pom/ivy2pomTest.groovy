import static org.jfrog.artifactory.client.ArtifactoryClient.create
import spock.lang.Specification

class Ivy2pomTest extends Specification {
    def 'test name'() {
        setup:
        def artifactory = create("http://localhost:8088/artifactory", "admin", "password")

        //when:

        //then:

        //cleanup:
    }
}
