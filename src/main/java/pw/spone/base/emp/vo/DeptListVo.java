package pw.spone.base.emp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", logicalName = "부서List정보")
public class DeptListVo extends pw.spone.base.cmmn.BaseCommVO {
	private static final long serialVersionUID = 1L;
	
    @ElDtoField(logicalName = "부서List", physicalName = "deptVoList", type = "", typeKind = "List", fldYn = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<pw.spone.base.emp.vo.DeptVo> deptVoList;


    public java.util.List<pw.spone.base.emp.vo.DeptVo> getDeptVoList(){
        return deptVoList;
    }

    public void setDeptVoList(java.util.List<pw.spone.base.emp.vo.DeptVo> deptVoList){
        this.deptVoList = deptVoList;
    }

  
    @Override
    public String toString() {
        return "DeptListVo [deptVoList=" + deptVoList + "]";
    }

    public boolean isFixedLengthVo() {
        return false;
    }

}
