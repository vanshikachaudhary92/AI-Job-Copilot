
package com.vanshika.jobcopilot;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Get all applications
    @GetMapping
    public List<Job> getJobs() {
        return jobRepository.findAll();
    }

    // Add an application
    @PostMapping
    public Job addJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    // Update application status
    @PutMapping("/{id}/status")
    public Job updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Job not found"));

        job.setStatus(status);
        return jobRepository.save(job);
    }

    // Delete an application
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJob(@PathVariable Long id) {

        if (!jobRepository.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Job not found");
        }

        jobRepository.deleteById(id);
    }
}
