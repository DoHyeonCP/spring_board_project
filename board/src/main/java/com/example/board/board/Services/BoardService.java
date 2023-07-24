import java.util.List;

import kr.kro.hex.domain.Board;

/**
 * �Խ��� ������ �������̽�
 *
 * @see Board �Խ��� Entity
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-21 ���� 11:04
 */

public interface BoardService {

    void insertBoard(Board board);

    List<Board> getBoardList();

    Board getBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Board board);
}