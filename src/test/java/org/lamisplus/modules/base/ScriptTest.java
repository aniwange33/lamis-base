package org.lamisplus.modules.base;

import com.zaxxer.hikari.HikariDataSource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class ScriptTest {
    DataSource dataSource;
    private final Path rootLocation = Paths.get("/home/mattae/modules");

    @Test
    public void testByteInsert() throws IOException {
        String identifier = "18\\34\\87\\16";
        LOG.info("Identifier: {}", identifier);
        String m = StringUtils.replaceChars(identifier, '\\', '-');
        LOG.info("Replaced: {}", m);
    }


//    @SneakyThrows
//    @Test
//    public void listScripts() {
//        List<UMDModule> modules = new ArrayList<>();
//        UMDModule module = new UMDModule("PharmacyModule", "/api/pharmacy", "");
//        module.setMap("{\"moment\": \"http://unpkg.com/moment\"}");
//        modules.add(module);
//
//        module = new UMDModule("EACModule", "/api/eac", "");
//        modules.add(module);
//        String content = String.join("\n", Files.readAllLines(
//                new File("/home/mattae/Development/lamis3/modules/lamis-patient/src/main/resources/views/static/patient/js/bundles/lamis-patient.umd.js").toPath()));
//        //new File("/home/mattae/modulea.umd.js").toPath()));
//        UMDModule umdModule = new UMDModule("PatientModule", "/", content);
//        //UMDModule umdModule = new UMDModule("ModuleaModule", "/", content);
//        umdModule.setMap("{\"@clr/angular\": \"https://unpkg.com/@clr/angular\"}");
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        umdModule = UMDModuleExtender.extendModule(umdModule, modules);
//        stopWatch.stop();
//        LOG.info("Elapse time 1: {}", stopWatch.getTime());
//        stopWatch.reset();
//
//        //LOG.info("Map 1: {}", umdModule.getMap());
//        //LOG.info("Content 1: {}", umdModule.getContent());
//        stopWatch.start();
//        umdModule = UMDModuleExtender.extendModule(umdModule, modules);
//        LOG.info("Elapse time 2: {}", stopWatch.getTime());
//        stopWatch.reset();
//        //LOG.info("Map 2: {}", umdModule.getMap());
//        //LOG.info("Content 2: {}", umdModule.getContent());
//        stopWatch.reset();
//        stopWatch.start();
//        umdModule = UMDModuleExtender.extendModule(umdModule, modules);
//        LOG.info("Elapse time 3: {}", stopWatch.getTime());
//        LOG.info("Content 2: {}", umdModule.getContent());
//
//    }

//    @SneakyThrows
//    @Test
//    public void testPrinceXml() {
//        PrinceControl control = new PrinceControl("/home/mattae/Development/lamis3/modules/web/runtime/princexml/lib/prince/bin/prince");
//        control.start();
//        LOG.info("Version: {}", control.getVersion());
//    }

    @SneakyThrows
    @Before
    public void setup() {
        String url = "jdbc:postgresql://localhost/lamis";

        dataSource = DataSourceBuilder.create()
                .type(HikariDataSource.class)
                .username("postgres")
                .password("amos33")
                .url(url)
                .driverClassName("org.postgresql.Driver")
                .build();
    }

    //public String store(String module, String name, InputStream inputStream) {
        /*module = module.toLowerCase();
        String filename = module + File.separator + StringUtils.cleanPath(name);
        if (filename.endsWith(File.separator)) {
            filename = filename.substring(0, filename.length() - 1) + ".jar";
        }

        if (!filename.endsWith(".jar")) {
            filename = filename + ".jar";
        }

        if (!Files.exists(this.rootLocation.resolve(module), new LinkOption[0])) {
            try {
                Files.createDirectories(this.rootLocation.resolve(module));
            } catch (IOException var7) {
                var7.printStackTrace();
            }
        }*/

       /* try {
            if (filename.contains("..")) {
                throw new RuntimeException("Cannot store file with relative path outside current directory " + filename);
            } else {
                FileUtils.copyInputStreamToFile(inputStream, this.rootLocation.resolve(filename).toFile());
                return filename;
            }
        } catch (IOException var6) {
            throw new RuntimeException("Failed to store file " + filename, var6);
        }*/
    //}
}
