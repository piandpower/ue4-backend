/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.LorePlanetsRecord;

import org.jooq.Field;
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
public class Tue4LorePlanets extends TableImpl<LorePlanetsRecord> {

    private static final long serialVersionUID = -1391473079;

    /**
     * The reference instance of <code>tue4_lore_planets</code>
     */
    public static final Tue4LorePlanets LORE_PLANETS = new Tue4LorePlanets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LorePlanetsRecord> getRecordType() {
        return LorePlanetsRecord.class;
    }

    /**
     * The column <code>tue4_lore_planets.lpla_id</code>.
     */
    public final TableField<LorePlanetsRecord, String> LPLA_ID = createField("lpla_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_planets.lpla_star_system</code>.
     */
    public final TableField<LorePlanetsRecord, String> LPLA_STAR_SYSTEM = createField("lpla_star_system", org.jooq.impl.SQLDataType.VARCHAR(255),
        this, "");

    /**
     * The column <code>tue4_lore_planets.lpla_lstar_id</code>.
     */
    public final TableField<LorePlanetsRecord, String> LPLA_LSTAR_ID = createField("lpla_lstar_id", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>tue4_lore_planets.lpla_name</code>.
     */
    public final TableField<LorePlanetsRecord, String> LPLA_NAME = createField("lpla_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_planets.lpla_position</code>.
     */
    public final TableField<LorePlanetsRecord, Integer> LPLA_POSITION = createField("lpla_position", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>tue4_lore_planets.lpla_owner</code>.
     */
    public final TableField<LorePlanetsRecord, String> LPLA_OWNER = createField("lpla_owner", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tue4_lore_planets.lpla_star_distance</code>.
     */
    public final TableField<LorePlanetsRecord, Long> LPLA_STAR_DISTANCE = createField("lpla_star_distance", org.jooq.impl.SQLDataType.BIGINT, this,
        "");

    /**
     * The column <code>tue4_lore_planets.lpla_star_au</code>.
     */
    public final TableField<LorePlanetsRecord, Double> LPLA_STAR_AU = createField("lpla_star_au", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>tue4_lore_planets.lpla_description</code>.
     */
    public final TableField<LorePlanetsRecord, String> LPLA_DESCRIPTION = createField("lpla_description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>tue4_lore_planets.created_at</code>.
     */
    public final TableField<LorePlanetsRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
        .defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>tue4_lore_planets.updated_at</code>.
     */
    public final TableField<LorePlanetsRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
        .defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>tue4_lore_planets</code> table reference
     */
    public Tue4LorePlanets() {
        this(DSL.name("tue4_lore_planets"), null);
    }

    /**
     * Create an aliased <code>tue4_lore_planets</code> table reference
     */
    public Tue4LorePlanets(String alias) {
        this(DSL.name(alias), LORE_PLANETS);
    }

    /**
     * Create an aliased <code>tue4_lore_planets</code> table reference
     */
    public Tue4LorePlanets(Name alias) {
        this(alias, LORE_PLANETS);
    }

    private Tue4LorePlanets(Name alias, Table<LorePlanetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4LorePlanets(Name alias, Table<LorePlanetsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LORE_PLANETS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LorePlanetsRecord> getPrimaryKey() {
        return Keys.LORE_PLANETS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LorePlanetsRecord>> getKeys() {
        return Arrays.<UniqueKey<LorePlanetsRecord>>asList(Keys.LORE_PLANETS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LorePlanets as(String alias) {
        return new Tue4LorePlanets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LorePlanets as(Name alias) {
        return new Tue4LorePlanets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LorePlanets rename(String name) {
        return new Tue4LorePlanets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LorePlanets rename(Name name) {
        return new Tue4LorePlanets(name, null);
    }
}