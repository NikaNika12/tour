//package tour.tourdemo.config;
//
//import java.util.Set;
//import jakarta.annotation.PostConstruct;
//import org.springframework.stereotype.Component;
//import tour.tourdemo.model.Role;
//import tour.tourdemo.model.User;
//import tour.tourdemo.service.RoleService;
//import tour.tourdemo.service.UserService;
//
//@Component
//public class DataInitializer {
//    private UserService userService;
//    private RoleService roleService;
//
//    public DataInitializer(UserService userService, RoleService roleService) {
//        this.userService = userService;
//        this.roleService = roleService;
//    }
//
//    @PostConstruct
//    public void inject() {
//        Role adminRole = new Role();
//        adminRole.setRoleName(Role.RoleName.ADMIN);
//        roleService.save(adminRole);
//        Role userRole = new Role();
//        userRole.setRoleName(Role.RoleName.USER);
//        roleService.save(userRole);
//        User admin = new User();
//        admin.setUsername("admin");
//        admin.setPassword("1234");
//        admin.setRoles(Set.of(adminRole));
//        userService.save(admin);
//    }
//}
