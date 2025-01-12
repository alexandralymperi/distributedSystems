package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.Report;
import gr.hua.dit.ds.ds2024Team77.entities.Review;
import gr.hua.dit.ds.ds2024Team77.repository.ReportRepository;
import gr.hua.dit.ds.ds2024Team77.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Transactional
    public Report getReport(Integer id){return reportRepository.findById(id).get();}

    @Transactional
    public void saveReport(Report report){
        reportRepository.save(report);
    }

    @Transactional
    public List<Report> getReports(){ return reportRepository.findAll(); }
}
