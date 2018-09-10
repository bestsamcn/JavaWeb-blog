package me.best.main.dao;

import me.best.main.models.Tag;

import java.util.List;

public interface TagDao {
    public Tag getById(String id);
    public List<Tag> getAll();
}
