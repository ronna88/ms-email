package br.com.ronna.email.ms.email.repositories;

import br.com.ronna.email.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
