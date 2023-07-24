import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.kro.hex.domain.Board;
import kr.kro.hex.persistance.BoardRepository;
import kr.kro.hex.service.BoardService;
import lombok.RequiredArgsConstructor;

/**
 * �Խ��� ������ ����ü
 *
 * @see Board �Խ��� Entity
 * @see BoardRepository �Խ��� �������丮
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-21 ���� 11:04
 */

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardServiceImpl implements BoardService {
    
    /** �Խ��� �������丮 */
    private final BoardRepository boardRepo;

    @Override
    public void insertBoard(Board board) {}

    @Override
    public List<Board> getBoardList() {
        return null;
    }

    @Override
    public Board getBoard(Board board) {
        return board;
    }

    @Override
    public void updateBoard(Board board) {}

    @Override
    public void deleteBoard(Board board) {}
}