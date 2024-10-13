package jdbc.course_monitoring.service;

import jdbc.course_monitoring.exception.BatchException;
import jdbc.course_monitoring.model.Batch;

import java.util.List;

public interface BatchService {
   String addBatch(Batch batch) throws BatchException;
    Batch getBatchById(int batchId) throws BatchException;
    List<Batch> getAllBatches() throws BatchException;
    String allocateFacultyToBatch(int facultyId, int batchId) throws BatchException;

    String updateBatch(int batchId, Batch batch) throws BatchException;

    String deleteBatch(int batchId) throws BatchException;
}
