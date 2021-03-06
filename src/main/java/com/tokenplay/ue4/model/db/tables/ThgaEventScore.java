/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.EventScoreRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Tue4EventScore extends TableImpl<EventScoreRecord> {

    private static final long serialVersionUID = 483310763;

    /**
     * The reference instance of <code>tue4_event_score</code>
     */
    public static final Tue4EventScore EVENT_SCORE = new Tue4EventScore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventScoreRecord> getRecordType() {
        return EventScoreRecord.class;
    }

    /**
     * The column <code>tue4_event_score.esc_id</code>.
     */
    public final TableField<EventScoreRecord, String> ESC_ID = createField("esc_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tue4_event_score.esc_sco_id</code>.
     */
    public final TableField<EventScoreRecord, String> ESC_SCO_ID =
        createField("esc_sco_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tue4_event_score.esc_event_type</code>.
     */
    public final TableField<EventScoreRecord, String> ESC_EVENT_TYPE = createField("esc_event_type", org.jooq.impl.SQLDataType.CLOB.nullable(false),
        this, "");

    /**
     * The column <code>tue4_event_score.esc_event_score</code>.
     */
    public final TableField<EventScoreRecord, Integer> ESC_EVENT_SCORE = createField("esc_event_score",
        org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>tue4_event_score</code> table reference
     */
    public Tue4EventScore() {
        this(DSL.name("tue4_event_score"), null);
    }

    /**
     * Create an aliased <code>tue4_event_score</code> table reference
     */
    public Tue4EventScore(String alias) {
        this(DSL.name(alias), EVENT_SCORE);
    }

    /**
     * Create an aliased <code>tue4_event_score</code> table reference
     */
    public Tue4EventScore(Name alias) {
        this(alias, EVENT_SCORE);
    }

    private Tue4EventScore(Name alias, Table<EventScoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4EventScore(Name alias, Table<EventScoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EVENT_SCORE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EventScoreRecord> getPrimaryKey() {
        return Keys.EVENT_SCORE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventScoreRecord>> getKeys() {
        return Arrays.<UniqueKey<EventScoreRecord>>asList(Keys.EVENT_SCORE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EventScoreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EventScoreRecord, ?>>asList(Keys.EVENT_SCORE__Tue4_EVENT_SCORE_ESC_SCO_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4EventScore as(String alias) {
        return new Tue4EventScore(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4EventScore as(Name alias) {
        return new Tue4EventScore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4EventScore rename(String name) {
        return new Tue4EventScore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4EventScore rename(Name name) {
        return new Tue4EventScore(name, null);
    }
}
