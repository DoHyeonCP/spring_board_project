import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.kro.hex.domain.Board;
import kr.kro.hex.persistance.BoardRepository;
import kr.kro.hex.service.BoardService;
import lombok.RequiredArgsConstructor;

/**
 * 게시판 서비스의 구현체
 *
 * @see Board 게시판 Entity
 * @see BoardRepository 게시판 레포지토리
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-21 오후 11:04
 */

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardServiceImpl implements BoardService {
    
    /** 게시판 레포지토리 */
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