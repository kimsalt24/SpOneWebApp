package pw.spone.base.cmmn;

import com.inswave.elfw.core.CommVO;
import com.inswave.elfw.page.DefaultWebPageRenderer;
import com.inswave.elfw.page.PageLabelVO;

public class BaseWebPageRenderer extends DefaultWebPageRenderer{

    public BaseWebPageRenderer(PageLabelVO vo) {
        super(vo);
    }

    @Override
    public String getPageRenderer(CommVO vo) {
        return super.getPageRenderer(vo);
    }
}
