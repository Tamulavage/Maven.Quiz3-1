package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        RockPaperScissorHandSign retval = null;
        switch (this) {
            case ROCK:
                retval = PAPER;
                break;
            case PAPER:
                retval = SCISSOR;
                break;
            case SCISSOR:
                retval = ROCK;
                break;
        }

        return retval;
    }

    public RockPaperScissorHandSign getLoser() {
        RockPaperScissorHandSign retval = null;
        switch (this) {
            case ROCK:
                retval = SCISSOR;
                break;
            case PAPER:
                retval = ROCK;
                break;
            case SCISSOR:
                retval = PAPER;
                break;
        }

        return retval;
    }
}
