package pw.spone.base.emp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import pw.spone.base.cmmn.dao.BaseDefaultAbstractDAO;
import pw.spone.base.emp.vo.DeptVo;
import pw.spone.base.emp.vo.EmpVo;

/**
 * @subject		: 데모용 사원 정보 관련 처리를 담당하는 DAO
 * @description	: 데모용 사원 정보 관련 처리를 담당하는 DAO
 * @author		: 개발팀
 * @since 		: 2023/05/31
 * @modification
 * ===========================================================
 * DATE				AUTHOR				NOTE
 * ===========================================================
 * 2023/05/31		샘플개발팀			최초 생성
 * 
 */
@Repository("empDAO")
public class EmpDAO extends BaseDefaultAbstractDAO {
	
	/**
	 * 사원 정보를 등록 처리한다.
	 * @param empVo 사원 정보 EmpVo
	 * @return 처리 건수 int
	 * @throws ElException
	 */
    public int insertEmp(EmpVo empVo) throws ElException {
        return insert("pw.spone.base.emp.insertEmp", empVo);
    }
    
    /**
     * 사원 정보를 갱신 처리한다.
     * @param empVo 사원 정보 EmpVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int updateEmp(EmpVo empVo) throws ElException {
        return update("pw.spone.base.emp.updateEmp", empVo);
    }
    
    /**
     * 사원 정보를 삭제 처리한다.
     * @param empVo 사원 정보 EmpVo
     * @return 처리 건수 int
     * @throws ElException
     */
    public int deleteEmp(EmpVo empVo) throws ElException {
    	return delete("pw.spone.base.emp.deleteEmp", empVo);
    }
    
    /**
     * 사원 정보를 상세 조회한다.
     * @param empVo 사원 정보 EmpVo
     * @return 사원 정보 EmpVo
     * @throws ElException
     */
    public EmpVo selectEmp(EmpVo empVo) throws ElException {
        return (EmpVo) selectByPk("pw.spone.base.emp.selectEmp", empVo);
    }
    
    /**
     * 사원 정보 목록을 조회한다.
     * @param empVo 사원 정보 EmpVo
     * @return 사원 정보 목록 List<EmpVo>
     * @throws ElException
     */
    public List<EmpVo> selectListEmp(EmpVo empVo) throws ElException {
    	AppLog.debug("DAO 에서 로그 테스트");
        return list("pw.spone.base.emp.selectListEmp", empVo);
    }
    
    /**
     * 사원 정보 목록 건수를 조회한다.
     * @param empVo 사원 정보 EmpVo
     * @return 사원 정보 목록 건수 long
     * @throws ElException
     */
    public long selectListCountEmp(EmpVo empVo) throws ElException {
        return (Long) selectByPk("pw.spone.base.emp.selectListCountEmp", empVo);
    }
    
    /**
     * 부서 정보 목록을 조회한다.
     * @param searchKeyHm 조건 검색 정보 HashMap
     * @return 부서 정보 목록 ArrayList<DeptVo>
     * @throws ElException
     */
    public ArrayList<DeptVo> selectListDept(HashMap searchKeyHm) throws ElException {
    	return (ArrayList<DeptVo>) list("pw.spone.base.emp.selectListDept", searchKeyHm);
    }

}
