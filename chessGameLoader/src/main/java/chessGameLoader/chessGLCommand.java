package chessGameLoader;

import app.chess.moves.ChessMove;
import app.chess.moves.Promotion;
import app.core.game.Field;
import app.core.game.moves.Move;
import app.core.game.moves.PieceMove;

import static GameLoader.common.Serializables.Command;

public class chessGLCommand extends Command {
    private final MoveInfo info;

    public chessGLCommand(int player, MoveInfo moveInfo) {
        super(player);
        info = moveInfo;
    }

    public MoveInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "chessGLCommand{" +
                "info=" + info +
                '}';
    }
}
