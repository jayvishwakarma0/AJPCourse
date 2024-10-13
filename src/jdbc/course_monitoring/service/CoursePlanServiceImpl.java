package jdbc.course_monitoring.service;


import jdbc.course_monitoring.dao.CoursePlanDao;
import jdbc.course_monitoring.dao.CoursePlanDaoImpl;
import jdbc.course_monitoring.exception.CourseException;
import jdbc.course_monitoring.exception.CoursePlanException;
import jdbc.course_monitoring.model.CoursePlan;

import java.util.List;

public class CoursePlanServiceImpl implements CoursePlanService{
    private CoursePlanDao dao;

    public CoursePlanServiceImpl() {
        this.dao = new CoursePlanDaoImpl();
    }

    public String addCoursePlan(CoursePlan coursePlan) throws CoursePlanException {
        return dao.addCoursePlan(coursePlan);
    }

    public List<CoursePlan> getCoursePlanByBatchId(int batchId) throws CoursePlanException {
        return dao.getCoursePlanByBatchId(batchId);
    }

    public void viewDayWiseUpdate(int batchId) throws CoursePlanException {
        dao.viewDayWiseUpdate(batchId);
    }

    public String updateCoursePlan(int planId, CoursePlan updatedCoursePlan) throws CourseException {
        return dao.updateCoursePlan(planId,updatedCoursePlan);
    }

    @Override
    public String deleteCoursePlan(int planId) throws CourseException {
        return dao.deleteCoursePlan(planId);
    }
}
