package fr.efrei2023.asta.projet_asta.service.tutor;

import fr.efrei2023.asta.projet_asta.model.TutorEntity;

public interface ITutorService {
    TutorEntity getTutorOrNull(String email);
}
