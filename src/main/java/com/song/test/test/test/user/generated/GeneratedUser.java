package com.song.test.test.test.user.generated;

import com.song.test.test.test.user.User;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.song.test.test.test.user.User}-interface representing entities of the
 * {@code user}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUser {
    
    /**
     * This Field corresponds to the {@link User} field that can be obtained
     * using the {@link User#getId()} method.
     */
    IntField<User, Integer> ID = IntField.create(
        Identifier.ID,
        User::getId,
        User::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link User} field that can be obtained
     * using the {@link User#getName()} method.
     */
    StringField<User, String> NAME = StringField.create(
        Identifier.NAME,
        User::getName,
        User::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link User} field that can be obtained
     * using the {@link User#getAge()} method.
     */
    IntField<User, Integer> AGE = IntField.create(
        Identifier.AGE,
        User::getAge,
        User::setAge,
        TypeMapper.primitive(),
        false
    );
    
    /**
     * Returns the id of this User. The id field corresponds to the database
     * column test.test.user.id.
     * 
     * @return the id of this User
     */
    int getId();
    
    /**
     * Returns the name of this User. The name field corresponds to the database
     * column test.test.user.name.
     * 
     * @return the name of this User
     */
    String getName();
    
    /**
     * Returns the age of this User. The age field corresponds to the database
     * column test.test.user.age.
     * 
     * @return the age of this User
     */
    int getAge();
    
    /**
     * Sets the id of this User. The id field corresponds to the database column
     * test.test.user.id.
     * 
     * @param id to set of this User
     * @return   this User instance
     */
    User setId(int id);
    
    /**
     * Sets the name of this User. The name field corresponds to the database
     * column test.test.user.name.
     * 
     * @param name to set of this User
     * @return     this User instance
     */
    User setName(String name);
    
    /**
     * Sets the age of this User. The age field corresponds to the database
     * column test.test.user.age.
     * 
     * @param age to set of this User
     * @return    this User instance
     */
    User setAge(int age);
    
    enum Identifier implements ColumnIdentifier<User> {
        
        ID   ("id"),
        NAME ("name"),
        AGE  ("age");
        
        private final String columnName;
        private final TableIdentifier<User> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "test";
        }
        
        @Override
        public String getSchemaName() {
            return "test";
        }
        
        @Override
        public String getTableName() {
            return "user";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<User> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}