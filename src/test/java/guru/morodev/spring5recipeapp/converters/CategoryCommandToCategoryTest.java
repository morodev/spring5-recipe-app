package guru.morodev.spring5recipeapp.converters;

import guru.morodev.spring5recipeapp.commands.CategoryCommand;
import guru.morodev.spring5recipeapp.domain.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By Luca Moro on 07/11/2020 18:44
 */
public class CategoryCommandToCategoryTest {

    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "description";
    CategoryCommandToCategory conveter;

    @Before
    public void setUp() throws Exception {
        conveter = new CategoryCommandToCategory();
    }

    @Test
    public void testNullObject() throws Exception {
        assertNull(conveter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(conveter.convert(new CategoryCommand()));
    }

    @Test
    public void convert() throws Exception {
        //given
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(ID_VALUE);
        categoryCommand.setDescription(DESCRIPTION);

        //when
        Category category = conveter.convert(categoryCommand);

        //then
        assertEquals(ID_VALUE, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());
    }

}