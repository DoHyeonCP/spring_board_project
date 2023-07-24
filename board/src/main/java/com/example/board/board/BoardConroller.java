import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kro.hex.domain.Board;
import kr.kro.hex.service.BoardService;
import kr.kro.hex.service.CategoryService;
import lombok.RequiredArgsConstructor;

/**
 * �Խ��� ���� ��Ʈ�ѷ�
 *
 * @see BoardService �Խ��� ����
 * @see CategoryService ī�װ� ����
 *
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-08 ���� 6:24
 */

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/board")
public class BoardController {
    
    /** �Խ��� ���� */
    private final BoardService boardService;

    /** ī�װ� ���� */
    private final CategoryService categoryService;

    /**
     * �Խñ� ��� �並 ��ȯ
     *
     * @author Rubisco
     * @param model ��
     * @return getBoardList.html
     */
    @GetMapping()
    public String getBoardListView(Model model) {
        model.addAttribute("boardList", boardService.getBoardList());
        return "getBoardList";
    }

    /**
     * �Խñ� �並 ��ȯ
     *
     * @see Board
     * @author Rubisco
     * @param board �Խñ�
     * @param model ��
     * @return getBoard.html
     */
    @GetMapping("/{documentId}")
    public String getBoardView(Board board, Model model) {
        model.addAttribute("nl", System.getProperty("line.separator"));
        model.addAttribute("board", boardService.getBoard(board));
        return "/board/getBoard";
    }

    /**
     * �Խñ� �ۼ� ������ �並 ��ȯ
     *
     * @author Rubisco
     * @param model ��
     * @return insertBoard.html
     */
    @GetMapping(params = "act=write")
    public String insertBoardView(Model model) {
        model.addAttribute("categoryList", categoryService.getCategoryList());
        return "/board/insertBoard";
    }

    /**
     * �Խñ� ���� ������ �並 ��ȯ
     *
     * @see Board
     * @param board �Խñ�
     * @param model ��
     * @return insertBoard.html
     * @author Rubisco
     */
    @GetMapping(params = {"documentId","act=update"})
    public String updateBoardView(Board board, Model model) {
        model.addAttribute("board", boardService.getBoard(board));
        model.addAttribute("categoryList", categoryService.getCategoryList());
        return "/board/insertBoard";
    }

    /**
     * �Խñ� ��� ��û�� ó��
     *
     * @see Board
     * @author Rubisco
     * @param board �Խñ�
     * @return redirect:/board
     */
    @PostMapping()
    public String insertBoardController(Board board) {
        boardService.insertBoard(board);
        return "redirect:/board";
    }

    /**
     * �Խñ� ���� ��û�� ó��
     *
     * @see Board
     * @param board �Խñ�
     * @author Rubisco
     * @return redirect:/board/{documentId}
     */
    @PatchMapping(params = "documentId")
    public String updateBoard(Board board) {
        boardService.updateBoard(board);
        return "redirect:/board/"+board.getDocumentId();
    }

    /**
     * �Խñ� ���� ��û�� ó��
     *
     * @author Rubisco
     * @param board
     * @return redirect:/board
     */
    @DeleteMapping(params = "documentId")
    public String deleteBoard(Board board) {
        boardService.deleteBoard(board);
        return "redirect:/board";
    }
}