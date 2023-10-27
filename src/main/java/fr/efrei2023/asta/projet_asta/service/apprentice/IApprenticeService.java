package fr.efrei2023.asta.projet_asta.service.apprentice;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;

import java.util.List;

public interface IApprenticeService {
    public List<ApprenticeEntity> getApprenticesByTutor(String tutorMail);
}
