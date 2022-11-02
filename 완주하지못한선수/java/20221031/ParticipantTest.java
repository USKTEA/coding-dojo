import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticipantTest {

    @Test
    void creation() {
        Participant participant = new Participant("leo");

        assertEquals(participant.getName(), "leo");
    }

    @Test
    void participantToString() {
        Participant participant = new Participant("leo");

        assertEquals("id: 1, name: leo", participant.toString());
    }

    @Test
    void equality() {
        Participant participant = new Participant("leo");

        assertEquals(new Participant("leo"), participant);
    }
}
