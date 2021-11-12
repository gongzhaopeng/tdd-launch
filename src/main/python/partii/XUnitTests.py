from XUnit import TestCase, WasRun


class TestCaseTest(TestCase):
    def test_template_method(self):
        test = WasRun("test_method")
        test.run()
        assert "setup test_method tear_down " == test.log


TestCaseTest("test_template_method").run()
