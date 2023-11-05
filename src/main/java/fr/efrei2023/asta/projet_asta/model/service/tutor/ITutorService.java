package fr.efrei2023.asta.projet_asta.model.service.tutor;

import fr.efrei2023.asta.projet_asta.model.entity.TutorEntity;

public interface ITutorService {
    TutorEntity getTutorOrNull(String email);
}
