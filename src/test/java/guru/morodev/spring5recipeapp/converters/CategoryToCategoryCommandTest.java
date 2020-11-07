package guru.morodev.spring5recipeapp.converters;

import guru.morodev.spring5recipeapp.commands.CategoryCommand;
import guru.morodev.spring5recipeapp.domain.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By Luca Moro on 07/11/2020 18:46
 */
public class CategoryToCategoryCommandTest {

    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "descript";
    CategoryToCategoryCommand convter;

    @Before
    public void setUp() throws Exception {
        convter = new CategoryToCategoryCommand();
    }

    @Test
    public void testNullObject() throws Exception {
        assertNull(convter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(convter.convert(new Category()));
    }

    @Test
    public void convert() throws Exception {
        //given
        Category category = new Category();
        category.setId(ID_VALUE);
        category.setDescription(DESCRIPTION);

        //when
        CategoryCommand categoryCommand = convter.convert(category);

        //then
        assertEquals(ID_VALUE, categoryCommand.getId());
        assertEquals(DESCRIPTION, categoryCommand.getDescription());

    }
}
