from testcase import TestCase
from was_run import WasRun


class TestCaseTest(TestCase):
    def test_template_method(self):
        test = WasRun("test_method")
        test.run()
        assert "setup test_method tear_down " == test.log

    def test_result(self):
        test = WasRun("test_method")
        result = test.run()
        assert "1 run, 0 failed" == result.summary()

    def test_failed_result(self):
        test = WasRun("test_broken_method")
        result = test.run()
        assert "1 run, 1 failed" == result.summary()


TestCaseTest("test_template_method").run()
TestCaseTest("test_result").run()
