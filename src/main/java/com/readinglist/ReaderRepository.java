package com.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Peter_Fazekas on 2017.03.26..
 */
public interface ReaderRepository
        extends JpaRepository<Reader, String> {
}
